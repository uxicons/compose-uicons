package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashEmpty: ImageVector? = null

val Icons.Br.TrashEmpty: ImageVector
    get() = _TrashEmpty ?: UXIcon(name = "TrashEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(2.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.69f, 0.47f, 1.27f, 1.11f, 1.44f)
            lineToRelative(1.26f, 15.99f)
            curveToRelative(0.22f, 2.84f, 2.63f, 5.07f, 5.48f, 5.07f)
            horizontalLineToRelative(6.29f)
            curveToRelative(2.85f, 0f, 5.26f, -2.23f, 5.48f, -5.07f)
            lineToRelative(1.26f, -15.99f)
            curveToRelative(0.64f, -0.17f, 1.11f, -0.75f, 1.11f, -1.44f)
            close()
            moveTo(17.64f, 18.7f)
            curveToRelative(-0.01f, 0.09f, -0.03f, 0.18f, -0.05f, 0.27f)
            lineToRelative(-3.48f, -3.48f)
            lineToRelative(3.13f, -3.12f)
            reflectiveCurveToRelative(0.79f, 0.75f, 0.83f, 0.79f)
            lineToRelative(-0.44f, 5.55f)
            close()
            moveTo(6.4f, 18.93f)
            curveToRelative(-0.01f, -0.08f, -0.04f, -0.15f, -0.04f, -0.23f)
            lineToRelative(-0.44f, -5.54f)
            curveToRelative(0.04f, -0.03f, 0.83f, -0.78f, 0.83f, -0.78f)
            lineToRelative(3.11f, 3.11f)
            lineToRelative(-3.46f, 3.44f)
            close()
            moveTo(7.84f, 3f)
            lineToRelative(2.05f, 2.04f)
            lineToRelative(-3.13f, 3.1f)
            reflectiveCurveToRelative(-1.29f, -1.26f, -1.33f, -1.29f)
            lineToRelative(-0.3f, -3.85f)
            horizontalLineToRelative(2.72f)
            close()
            moveTo(8.88f, 10.26f)
            lineToRelative(3.13f, -3.1f)
            lineToRelative(3.1f, 3.09f)
            lineToRelative(-3.13f, 3.12f)
            lineToRelative(-3.1f, -3.1f)
            close()
            moveTo(18.58f, 6.8f)
            lineToRelative(-1.33f, 1.33f)
            lineToRelative(-3.1f, -3.08f)
            lineToRelative(2.06f, -2.05f)
            horizontalLineToRelative(2.67f)
            lineToRelative(-0.3f, 3.8f)
            close()
            moveTo(8.86f, 21f)
            curveToRelative(-0.09f, 0f, -0.17f, -0.02f, -0.26f, -0.03f)
            lineToRelative(3.38f, -3.37f)
            lineToRelative(3.38f, 3.38f)
            curveToRelative(-0.07f, 0.01f, -0.14f, 0.02f, -0.21f, 0.02f)
            horizontalLineToRelative(-6.29f)
            close()
        }
    }.also { _TrashEmpty = it }
