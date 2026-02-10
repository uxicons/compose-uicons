package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Church: ImageVector? = null

val Icons.Ss.Church: ImageVector
    get() = _Church ?: UXIcon(name = "Church") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 5.99f)
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
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.99f)
                close()
                moveTo(19f, 10.36f)
                verticalLineToRelative(13.65f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-10.01f)
                lineToRelative(-5f, -3.64f)
                close()
                moveTo(5f, 10.36f)
                lineTo(0f, 13.99f)
                verticalLineToRelative(10.01f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-13.65f)
                close()
            }
        }.also { _Church = it}
