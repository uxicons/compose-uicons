package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Bs.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 19.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.02f, -0.63f, -1.91f, -1.54f, -2.29f)
                lineToRelative(-4.44f, 4.82f)
                lineToRelative(-4.47f, -4.83f)
                curveToRelative(-0.92f, 0.37f, -1.55f, 1.27f, -1.55f, 2.3f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.8f, 2.1f, -5.14f, 4.89f, -5.45f)
                lineToRelative(0.75f, -0.08f)
                lineToRelative(3.37f, 3.64f)
                lineToRelative(3.35f, -3.64f)
                lineToRelative(0.76f, 0.09f)
                curveToRelative(2.77f, 0.32f, 4.87f, 2.66f, 4.87f, 5.44f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(15f, 6f)
                curveToRelative(0f, -1.0f, -0.5f, -1.89f, -1.26f, -2.43f)
                curveToRelative(-0.87f, 1.45f, -2.45f, 2.43f, -4.26f, 2.43f)
                curveToRelative(-0.16f, 0f, -0.32f, -0.03f, -0.47f, -0.05f)
                curveToRelative(0f, 0.02f, -0.01f, 0.03f, -0.01f, 0.05f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _UserVneckHair = it}
