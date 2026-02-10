package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square: ImageVector? = null

val Icons.Tc.Square: ImageVector
    get() = _Square ?: UXIcon(name = "Square") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 2.56f)
                curveToRelative(-0.05f, -0.16f, -0.18f, -0.29f, -0.34f, -0.34f)
                curveToRelative(-0.18f, -0.05f, -4.4f, -1.23f, -9.4f, -1.23f)
                reflectiveCurveTo(2.77f, 2.18f, 2.6f, 2.23f)
                curveToRelative(-0.16f, 0.05f, -0.29f, 0.17f, -0.34f, 0.34f)
                curveToRelative(-0.05f, 0.17f, -1.23f, 4.13f, -1.23f, 9.44f)
                curveToRelative(0f, 5.35f, 1.18f, 9.27f, 1.23f, 9.44f)
                curveToRelative(0.05f, 0.16f, 0.18f, 0.29f, 0.34f, 0.34f)
                curveToRelative(0.18f, 0.05f, 4.4f, 1.23f, 9.4f, 1.23f)
                reflectiveCurveToRelative(9.23f, -1.18f, 9.4f, -1.23f)
                curveToRelative(0.16f, -0.05f, 0.29f, -0.17f, 0.34f, -0.34f)
                curveToRelative(0.05f, -0.17f, 1.23f, -4.13f, 1.23f, -9.44f)
                curveToRelative(0f, -5.35f, -1.18f, -9.27f, -1.23f, -9.44f)
                close()
                moveTo(20.86f, 20.88f)
                curveToRelative(-1.01f, 0.26f, -4.71f, 1.12f, -8.86f, 1.12f)
                reflectiveCurveToRelative(-7.86f, -0.86f, -8.87f, -1.12f)
                curveToRelative(-0.26f, -0.96f, -1.11f, -4.45f, -1.11f, -8.88f)
                curveToRelative(0f, -4.39f, 0.85f, -7.91f, 1.11f, -8.88f)
                curveToRelative(1.01f, -0.26f, 4.71f, -1.12f, 8.86f, -1.12f)
                reflectiveCurveToRelative(7.86f, 0.86f, 8.87f, 1.12f)
                curveToRelative(0.26f, 0.96f, 1.11f, 4.45f, 1.11f, 8.88f)
                curveToRelative(0f, 4.39f, -0.85f, 7.91f, -1.11f, 8.88f)
                close()
            }
        }.also { _Square = it}
