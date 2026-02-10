package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pallet: ImageVector? = null

val Icons.Sc.Pallet: ImageVector
    get() = _Pallet ?: UXIcon(name = "Pallet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 13.41f)
                curveToRelative(0.05f, 0.83f, -0.58f, 1.54f, -1.4f, 1.59f)
                curveToRelative(-0.82f, 0.05f, -1.54f, -0.57f, -1.59f, -1.4f)
                curveToRelative(-0.02f, -0.4f, -0.1f, -0.85f, -0.18f, -1.25f)
                curveToRelative(-1.33f, -0.11f, -3.75f, -0.28f, -6.32f, -0.33f)
                verticalLineToRelative(1.48f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.48f)
                curveToRelative(-2.58f, 0.05f, -5.01f, 0.22f, -6.33f, 0.33f)
                curveToRelative(-0.08f, 0.39f, -0.15f, 0.83f, -0.17f, 1.2f)
                curveToRelative(-0.03f, 0.83f, -0.73f, 1.48f, -1.55f, 1.45f)
                curveToRelative(-0.83f, -0.03f, -1.48f, -0.72f, -1.45f, -1.55f)
                curveToRelative(0.04f, -1.3f, 0.49f, -2.79f, 0.54f, -2.95f)
                curveToRelative(0.18f, -0.58f, 0.69f, -0.99f, 1.28f, -1.05f)
                curveToRelative(0.19f, -0.02f, 4.65f, -0.45f, 9.17f, -0.45f)
                reflectiveCurveToRelative(8.98f, 0.43f, 9.17f, 0.45f)
                curveToRelative(0.61f, 0.06f, 1.12f, 0.48f, 1.29f, 1.07f)
                curveToRelative(0.02f, 0.06f, 0.45f, 1.56f, 0.53f, 2.88f)
                close()
            }
        }.also { _Pallet = it}
