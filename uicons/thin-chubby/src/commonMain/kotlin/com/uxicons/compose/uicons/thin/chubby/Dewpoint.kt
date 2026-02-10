package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Tc.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.42f, 1f)
                curveToRelative(-1.81f, 0f, -2.7f, 0.88f, -2.7f, 2.67f)
                reflectiveCurveToRelative(0.88f, 2.67f, 2.7f, 2.67f)
                reflectiveCurveToRelative(2.7f, -0.88f, 2.7f, -2.67f)
                reflectiveCurveToRelative(-0.88f, -2.67f, -2.7f, -2.67f)
                close()
                moveTo(19.42f, 5.35f)
                curveToRelative(-1.1f, 0f, -1.7f, -0.27f, -1.7f, -1.68f)
                reflectiveCurveToRelative(0.6f, -1.68f, 1.7f, -1.68f)
                reflectiveCurveToRelative(1.7f, 0.27f, 1.7f, 1.68f)
                reflectiveCurveToRelative(-0.6f, 1.68f, -1.7f, 1.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.58f, 4.16f)
                curveToRelative(-0.15f, -0.09f, -0.34f, -0.08f, -0.49f, 0.01f)
                curveToRelative(-0.33f, 0.19f, -8.12f, 4.81f, -8.21f, 10.4f)
                curveToRelative(0.13f, 4.28f, 4.24f, 8.38f, 8.47f, 8.44f)
                curveToRelative(4.22f, -0.06f, 8.46f, -4.21f, 8.46f, -8.46f)
                curveToRelative(0f, -5.64f, -7.89f, -10.2f, -8.22f, -10.38f)
                close()
                moveTo(10.35f, 22f)
                curveToRelative(-3.66f, -0.05f, -7.36f, -3.75f, -7.47f, -7.44f)
                curveToRelative(0.07f, -4.49f, 6.16f, -8.55f, 7.47f, -9.38f)
                curveToRelative(1.31f, 0.79f, 7.36f, 4.66f, 7.46f, 9.37f)
                curveToRelative(-0.12f, 3.71f, -3.81f, 7.4f, -7.46f, 7.46f)
                close()
            }
        }.also { _Dewpoint = it}
