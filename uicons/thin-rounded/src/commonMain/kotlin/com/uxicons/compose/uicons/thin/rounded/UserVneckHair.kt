package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Tr.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                curveToRelative(-3.32f, -0.02f, -6.02f, 2.77f, -6f, 6f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
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
                moveTo(21f, 20.88f)
                verticalLineToRelative(2.62f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.62f)
                curveToRelative(0f, -2.11f, -0.87f, -4.35f, -2.16f, -5.56f)
                curveToRelative(-0.46f, -0.46f, -1.27f, -0.38f, -1.69f, 0.1f)
                lineToRelative(-3.77f, 4.41f)
                curveToRelative(-0.19f, 0.23f, -0.57f, 0.23f, -0.76f, 0f)
                lineToRelative(-3.76f, -4.42f)
                curveToRelative(-0.41f, -0.48f, -1.22f, -0.53f, -1.68f, -0.1f)
                curveToRelative(-1.3f, 1.21f, -2.17f, 3.45f, -2.17f, 5.57f)
                verticalLineToRelative(2.62f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.62f)
                curveToRelative(0f, -2.38f, 1f, -4.91f, 2.49f, -6.3f)
                curveToRelative(0.85f, -0.84f, 2.35f, -0.73f, 3.12f, 0.17f)
                lineToRelative(3.39f, 3.98f)
                lineToRelative(3.39f, -3.97f)
                curveToRelative(0.77f, -0.91f, 2.29f, -1.01f, 3.13f, -0.17f)
                curveToRelative(1.48f, 1.39f, 2.48f, 3.92f, 2.48f, 6.29f)
                close()
            }
        }.also { _UserVneckHair = it}
