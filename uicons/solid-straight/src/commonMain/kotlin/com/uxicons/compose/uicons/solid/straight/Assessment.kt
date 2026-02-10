package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Assessment: ImageVector? = null

val Icons.Ss.Assessment: ImageVector
    get() = _Assessment ?: UXIcon(name = "Assessment") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.55f, 22.14f)
                lineToRelative(-2.67f, -2.67f)
                curveToRelative(0.7f, -0.98f, 1.11f, -2.18f, 1.11f, -3.47f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.3f, 0f, 2.49f, -0.41f, 3.47f, -1.11f)
                lineToRelative(2.67f, 2.67f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(16.75f, 18.44f)
                curveToRelative(-0.74f, 0.74f, -2.06f, 0.75f, -2.82f, -0.02f)
                lineToRelative(-2.18f, -2.27f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.22f, 2.3f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-0.0f, 0.0f)
                close()
                moveTo(8f, 16.0f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                curveToRelative(1.46f, 0f, 2.82f, 0.4f, 4f, 1.08f)
                verticalLineToRelative(-2.08f)
                horizontalLineToRelative(0f)
                lineTo(20f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.35f, 0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-0.0f)
                lineToRelative(7.96f, 0.0f)
                curveToRelative(-4.39f, -0.02f, -7.96f, -3.6f, -7.96f, -8.0f)
                close()
                moveTo(9f, 5.0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 17.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 12.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 7.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Assessment = it}
