package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Sc.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 13f)
                curveToRelative(0f, 3.41f, -1.59f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -1.59f, -5f, -5f)
                curveToRelative(0f, -3.25f, 3.93f, -6.43f, 4.38f, -6.79f)
                curveToRelative(0.36f, -0.28f, 0.87f, -0.28f, 1.24f, 0f)
                curveToRelative(0.45f, 0.35f, 4.38f, 3.54f, 4.38f, 6.79f)
                close()
                moveTo(10.5f, 9f)
                curveToRelative(2.32f, 0f, 3.5f, -1.18f, 3.5f, -3.5f)
                curveToRelative(0f, -1.86f, -2.39f, -3.89f, -2.87f, -4.28f)
                curveToRelative(-0.37f, -0.3f, -0.89f, -0.3f, -1.26f, 0f)
                curveToRelative(-0.48f, 0.39f, -2.87f, 2.42f, -2.87f, 4.28f)
                curveToRelative(0f, 2.32f, 1.18f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(7.12f, 9.96f)
                curveToRelative(-0.36f, -0.28f, -0.87f, -0.28f, -1.24f, 0f)
                curveToRelative(-0.5f, 0.39f, -4.88f, 3.94f, -4.88f, 7.54f)
                curveToRelative(0f, 3.75f, 1.75f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.75f, 5.5f, -5.5f)
                curveToRelative(0f, -3.6f, -4.38f, -7.14f, -4.88f, -7.54f)
                close()
            }
        }.also { _Blood = it}
