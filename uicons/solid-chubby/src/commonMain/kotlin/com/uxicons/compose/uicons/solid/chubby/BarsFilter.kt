package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsFilter: ImageVector? = null

val Icons.Sc.BarsFilter: ImageVector
    get() = _BarsFilter ?: UXIcon(name = "BarsFilter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 4.45f)
                curveToRelative(-0.13f, 0.82f, -0.93f, 1.37f, -1.73f, 1.23f)
                curveToRelative(-0.04f, -0.01f, -4.11f, -0.68f, -9.25f, -0.68f)
                reflectiveCurveToRelative(-9.21f, 0.67f, -9.25f, 0.68f)
                curveToRelative(-0.82f, 0.13f, -1.59f, -0.41f, -1.73f, -1.23f)
                curveToRelative(-0.14f, -0.82f, 0.41f, -1.59f, 1.23f, -1.73f)
                curveToRelative(0.17f, -0.03f, 4.34f, -0.72f, 9.75f, -0.72f)
                reflectiveCurveToRelative(9.57f, 0.69f, 9.75f, 0.72f)
                curveToRelative(0.82f, 0.14f, 1.37f, 0.91f, 1.23f, 1.73f)
                close()
                moveTo(18.73f, 11.02f)
                curveToRelative(-1.55f, -0.24f, -3.97f, -0.52f, -6.73f, -0.52f)
                reflectiveCurveToRelative(-5.18f, 0.28f, -6.73f, 0.52f)
                curveToRelative(-0.82f, 0.12f, -1.38f, 0.89f, -1.26f, 1.71f)
                curveToRelative(0.12f, 0.82f, 0.91f, 1.39f, 1.71f, 1.26f)
                curveToRelative(1.45f, -0.22f, 3.71f, -0.48f, 6.27f, -0.48f)
                reflectiveCurveToRelative(4.83f, 0.26f, 6.27f, 0.48f)
                curveToRelative(0.82f, 0.13f, 1.58f, -0.44f, 1.71f, -1.26f)
                curveToRelative(0.12f, -0.82f, -0.44f, -1.58f, -1.26f, -1.71f)
                close()
                moveTo(16.15f, 19.21f)
                curveToRelative(-2.79f, -0.28f, -5.5f, -0.28f, -8.29f, 0f)
                curveToRelative(-0.82f, 0.08f, -1.43f, 0.82f, -1.34f, 1.64f)
                curveToRelative(0.08f, 0.82f, 0.81f, 1.42f, 1.64f, 1.35f)
                curveToRelative(2.6f, -0.26f, 5.11f, -0.26f, 7.71f, 0f)
                curveToRelative(0.81f, 0.08f, 1.56f, -0.52f, 1.64f, -1.35f)
                curveToRelative(0.08f, -0.82f, -0.52f, -1.56f, -1.35f, -1.64f)
                close()
            }
        }.also { _BarsFilter = it}
