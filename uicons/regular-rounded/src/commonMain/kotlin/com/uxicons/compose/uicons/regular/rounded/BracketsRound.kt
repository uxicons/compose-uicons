package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Rr.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                curveToRelative(0f, 6.41f, 4.58f, 10.18f, 4.63f, 10.22f)
                curveToRelative(0.43f, 0.35f, 0.5f, 0.98f, 0.15f, 1.41f)
                curveToRelative(-0.2f, 0.25f, -0.49f, 0.37f, -0.78f, 0.37f)
                curveToRelative(-0.22f, 0f, -0.44f, -0.07f, -0.62f, -0.22f)
                curveToRelative(-0.22f, -0.18f, -5.38f, -4.39f, -5.38f, -11.78f)
                reflectiveCurveTo(5.16f, 0.39f, 5.38f, 0.22f)
                curveToRelative(0.43f, -0.34f, 1.06f, -0.28f, 1.41f, 0.16f)
                curveToRelative(0.35f, 0.43f, 0.28f, 1.06f, -0.16f, 1.41f)
                curveToRelative(-0.04f, 0.04f, -4.62f, 3.81f, -4.62f, 10.22f)
                close()
                moveTo(18.62f, 0.22f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.27f, -1.4f, 0.15f)
                curveToRelative(-0.35f, 0.43f, -0.28f, 1.06f, 0.15f, 1.41f)
                curveToRelative(0.05f, 0.04f, 4.63f, 3.81f, 4.63f, 10.22f)
                reflectiveCurveToRelative(-4.54f, 10.15f, -4.63f, 10.22f)
                curveToRelative(-0.43f, 0.35f, -0.5f, 0.97f, -0.16f, 1.4f)
                curveToRelative(0.2f, 0.25f, 0.49f, 0.38f, 0.78f, 0.38f)
                curveToRelative(0.22f, 0f, 0.44f, -0.07f, 0.62f, -0.22f)
                curveToRelative(0.22f, -0.18f, 5.38f, -4.39f, 5.38f, -11.78f)
                reflectiveCurveTo(18.84f, 0.39f, 18.62f, 0.22f)
                close()
            }
        }.also { _BracketsRound = it}
