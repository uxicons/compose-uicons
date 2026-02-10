package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MovFile: ImageVector? = null

val Icons.Bs.MovFile: ImageVector
    get() = _MovFile ?: UXIcon(name = "MovFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(17.5f)
                lineToRelative(6.5f, -6.5f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(15.49f, 3.03f)
                lineToRelative(0.83f, 3.28f)
                lineToRelative(0.68f, -3.28f)
                horizontalLineToRelative(1.25f)
                lineToRelative(-1.25f, 6f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.51f, -6f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(9.5f, 4.97f)
                curveToRelative(0f, -1.09f, 0.91f, -1.96f, 2f, -1.96f)
                reflectiveCurveToRelative(2f, 0.88f, 2f, 1.96f)
                verticalLineToRelative(2.07f)
                curveToRelative(0f, 1.09f, -0.91f, 1.97f, -2f, 1.97f)
                reflectiveCurveToRelative(-2f, -0.88f, -2f, -1.97f)
                verticalLineToRelative(-2.07f)
                close()
                moveTo(3.38f, 3.76f)
                curveToRelative(0.03f, -0.54f, 0.36f, -0.76f, 0.75f, -0.76f)
                curveToRelative(0.26f, 0f, 0.5f, 0.18f, 0.64f, 0.49f)
                lineToRelative(0.88f, 1.94f)
                lineToRelative(0.88f, -1.94f)
                curveToRelative(0.14f, -0.3f, 0.38f, -0.49f, 0.64f, -0.49f)
                curveToRelative(0.39f, 0f, 0.72f, 0.22f, 0.75f, 0.76f)
                lineToRelative(0.39f, 5.31f)
                horizontalLineToRelative(-1.22f)
                lineToRelative(-0.24f, -3.34f)
                lineToRelative(-1.2f, 2.63f)
                lineToRelative(-1.2f, -2.63f)
                lineToRelative(-0.24f, 3.34f)
                horizontalLineToRelative(-1.22f)
                lineToRelative(0.39f, -5.31f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineTo(3f, 21f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(4f)
                close()
                moveTo(12.25f, 7.01f)
                curveToRelative(0.0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.74f)
                curveToRelative(-0.4f, -0.01f, -0.77f, -0.33f, -0.77f, -0.74f)
                curveToRelative(0f, -0.05f, 0f, -1.98f, 0f, -2.02f)
                curveToRelative(-0.0f, -0.4f, 0.34f, -0.72f, 0.75f, -0.73f)
                curveToRelative(0.4f, 0.01f, 0.75f, 0.33f, 0.75f, 0.73f)
                curveToRelative(0f, 0.05f, 0f, 1.98f, 0f, 2.02f)
                close()
            }
        }.also { _MovFile = it}
