package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Ts.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.53f, 0f, 1.04f, 0.11f, 1.52f, 0.26f)
                curveToRelative(-0.68f, 2.21f, -2.7f, 3.74f, -5.02f, 3.74f)
                horizontalLineToRelative(-1.4f)
                curveToRelative(0.47f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(2.72f, 0f, 5.09f, -1.77f, 5.94f, -4.34f)
                curveToRelative(1.52f, 0.86f, 2.56f, 2.47f, 2.56f, 4.34f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
                moveTo(21f, 18.76f)
                verticalLineToRelative(5.24f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0f, -2.0f, -1.57f, -3.63f, -3.54f, -3.75f)
                lineToRelative(-4.45f, 5.08f)
                lineToRelative(-4.48f, -5.08f)
                curveToRelative(-1.97f, 0.11f, -3.54f, 1.75f, -3.54f, 3.75f)
                verticalLineToRelative(5.24f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.24f)
                curveToRelative(0f, -2.62f, 2.13f, -4.76f, 4.76f, -4.76f)
                horizontalLineToRelative(0.23f)
                lineToRelative(4.03f, 4.57f)
                lineToRelative(4.01f, -4.57f)
                horizontalLineToRelative(0.23f)
                curveToRelative(2.62f, 0f, 4.76f, 2.13f, 4.76f, 4.76f)
                close()
            }
        }.also { _UserVneckHair = it}
