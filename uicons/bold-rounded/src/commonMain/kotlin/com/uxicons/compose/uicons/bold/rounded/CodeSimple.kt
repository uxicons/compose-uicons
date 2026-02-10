package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Br.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 22f)
            curveToRelative(-0.37f, 0f, -0.75f, -0.14f, -1.04f, -0.42f)
            lineTo(1.34f, 15.26f)
            curveToRelative(-1.78f, -1.78f, -1.78f, -4.63f, -0.02f, -6.39f)
            lineTo(7.96f, 2.42f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.56f, 2.12f, 0.03f)
            curveToRelative(0.58f, 0.59f, 0.56f, 1.54f, -0.03f, 2.12f)
            lineTo(3.42f, 11.01f)
            curveToRelative(-0.27f, 0.27f, -0.42f, 0.65f, -0.42f, 1.04f)
            reflectiveCurveToRelative(0.16f, 0.78f, 0.44f, 1.06f)
            lineToRelative(6.6f, 6.3f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.05f, 2.12f)
            curveToRelative(-0.29f, 0.31f, -0.69f, 0.46f, -1.08f, 0.46f)
            close()
            moveTo(16.05f, 21.57f)
            lineToRelative(6.62f, -6.45f)
            curveToRelative(1.75f, -1.75f, 1.75f, -4.61f, -0.02f, -6.39f)
            lineToRelative(-6.6f, -6.33f)
            curveToRelative(-0.6f, -0.57f, -1.55f, -0.55f, -2.12f, 0.04f)
            curveToRelative(-0.57f, 0.6f, -0.55f, 1.55f, 0.04f, 2.12f)
            lineToRelative(6.58f, 6.3f)
            curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0.01f, 2.11f)
            lineToRelative(-6.6f, 6.43f)
            curveToRelative(-0.59f, 0.58f, -0.61f, 1.53f, -0.03f, 2.12f)
            curveToRelative(0.29f, 0.3f, 0.68f, 0.45f, 1.07f, 0.45f)
            curveToRelative(0.38f, 0f, 0.76f, -0.14f, 1.05f, -0.43f)
            close()
        }
    }.also { _CodeSimple = it }
