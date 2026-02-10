package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePlus: ImageVector? = null

val Icons.Tc.SquarePlus: ImageVector
    get() = _SquarePlus ?: UXIcon(name = "SquarePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.77f, 2.56f)
                curveToRelative(-0.05f, -0.16f, -0.18f, -0.29f, -0.34f, -0.34f)
                curveToRelative(-0.18f, -0.05f, -4.41f, -1.23f, -9.43f, -1.23f)
                reflectiveCurveToRelative(-9.25f, 1.18f, -9.43f, 1.23f)
                curveToRelative(-0.16f, 0.05f, -0.29f, 0.17f, -0.34f, 0.34f)
                curveToRelative(-0.05f, 0.17f, -1.23f, 4.13f, -1.23f, 9.44f)
                curveToRelative(0f, 5.35f, 1.18f, 9.27f, 1.23f, 9.44f)
                curveToRelative(0.05f, 0.16f, 0.18f, 0.29f, 0.34f, 0.34f)
                curveToRelative(0.18f, 0.05f, 4.41f, 1.23f, 9.43f, 1.23f)
                reflectiveCurveToRelative(9.25f, -1.18f, 9.43f, -1.23f)
                curveToRelative(0.16f, -0.05f, 0.29f, -0.17f, 0.34f, -0.34f)
                curveToRelative(0.05f, -0.17f, 1.23f, -4.13f, 1.23f, -9.44f)
                curveToRelative(0f, -5.35f, -1.18f, -9.27f, -1.23f, -9.44f)
                close()
                moveTo(20.89f, 20.88f)
                curveToRelative(-1.01f, 0.26f, -4.73f, 1.12f, -8.89f, 1.12f)
                reflectiveCurveToRelative(-7.88f, -0.86f, -8.89f, -1.12f)
                curveToRelative(-0.26f, -0.96f, -1.11f, -4.46f, -1.11f, -8.88f)
                curveToRelative(0f, -4.39f, 0.85f, -7.91f, 1.11f, -8.88f)
                curveToRelative(1.01f, -0.26f, 4.73f, -1.12f, 8.89f, -1.12f)
                reflectiveCurveToRelative(7.88f, 0.86f, 8.89f, 1.12f)
                curveToRelative(0.26f, 0.96f, 1.11f, 4.46f, 1.11f, 8.88f)
                curveToRelative(0f, 4.39f, -0.85f, 7.91f, -1.11f, 8.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 11.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _SquarePlus = it}
