package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meeting: ImageVector? = null

val Icons.Bs.Meeting: ImageVector
    get() = _Meeting ?: UXIcon(name = "Meeting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(4f, 18f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-3.93f)
                lineToRelative(-1.74f, 1.5f)
                curveToRelative(-0.37f, 0.33f, -0.85f, 0.5f, -1.32f, 0.5f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.35f, -0.51f)
                lineToRelative(-1.69f, -1.49f)
                horizontalLineToRelative(-3.97f)
                lineTo(5f, 2.55f)
                curveToRelative(0f, -1.41f, 1.14f, -2.55f, 2.55f, -2.55f)
                horizontalLineToRelative(8.9f)
                curveToRelative(1.41f, 0f, 2.55f, 1.14f, 2.55f, 2.55f)
                verticalLineToRelative(8.45f)
                close()
                moveTo(16f, 3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.91f, 1.68f)
                lineToRelative(1.94f, -1.68f)
                horizontalLineToRelative(2.05f)
                lineTo(16f, 3f)
                close()
            }
        }.also { _Meeting = it}
