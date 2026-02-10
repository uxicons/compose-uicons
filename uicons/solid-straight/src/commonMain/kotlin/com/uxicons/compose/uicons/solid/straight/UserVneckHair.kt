package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Ss.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.41f, 0f, 4.57f, -1.29f, 5.78f, -3.28f)
                curveToRelative(-0.56f, -0.39f, -1.23f, -0.62f, -1.94f, -0.69f)
                curveToRelative(-0.88f, 1.2f, -2.28f, 1.97f, -3.84f, 1.97f)
                horizontalLineToRelative(-2.15f)
                curveToRelative(0.83f, -2.33f, 3.04f, -4f, 5.65f, -4f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(3f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.45f)
                lineToRelative(3.55f, 4.02f)
                lineToRelative(3.53f, -4.02f)
                horizontalLineToRelative(0.45f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _UserVneckHair = it}
