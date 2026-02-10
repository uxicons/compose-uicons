package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Church: ImageVector? = null

val Icons.Sr.Church: ImageVector
    get() = _Church ?: UXIcon(name = "Church") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.99f)
                lineToRelative(-4f, 2.91f)
                verticalLineToRelative(15.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-15.1f)
                lineToRelative(-4f, -2.91f)
                verticalLineToRelative(-1.99f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(5f, 10.35f)
                lineToRelative(-2.94f, 2.14f)
                curveToRelative(-1.29f, 0.94f, -2.06f, 2.44f, -2.06f, 4.04f)
                verticalLineToRelative(3.96f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-13.65f)
                close()
                moveTo(21.94f, 12.49f)
                lineToRelative(-2.94f, -2.14f)
                verticalLineToRelative(13.65f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-3.96f)
                curveToRelative(0f, -1.6f, -0.77f, -3.1f, -2.06f, -4.04f)
                close()
            }
        }.also { _Church = it}
