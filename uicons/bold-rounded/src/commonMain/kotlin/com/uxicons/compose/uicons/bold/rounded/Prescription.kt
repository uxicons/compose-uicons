package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Prescription: ImageVector? = null

val Icons.Br.Prescription: ImageVector
    get() = _Prescription ?: UXIcon(name = "Prescription") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.3f, 18f)
            lineToRelative(2.44f, -3.67f)
            curveToRelative(0.46f, -0.69f, 0.27f, -1.62f, -0.42f, -2.08f)
            curveToRelative(-0.69f, -0.46f, -1.62f, -0.27f, -2.08f, 0.42f)
            lineToRelative(-1.75f, 2.63f)
            lineToRelative(-1.79f, -2.68f)
            curveToRelative(2.5f, -0.91f, 4.29f, -3.31f, 4.29f, -6.11f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            horizontalLineToRelative(-4.0f)
            curveTo(5.46f, 0f, 3.0f, 2.47f, 3.0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(5.37f)
            lineToRelative(3.33f, 5f)
            lineToRelative(-2.44f, 3.67f)
            curveToRelative(-0.46f, 0.69f, -0.27f, 1.62f, 0.42f, 2.08f)
            curveToRelative(0.26f, 0.17f, 0.55f, 0.25f, 0.83f, 0.25f)
            curveToRelative(0.48f, 0f, 0.96f, -0.23f, 1.25f, -0.67f)
            lineToRelative(1.75f, -2.63f)
            lineToRelative(1.75f, 2.63f)
            curveToRelative(0.29f, 0.43f, 0.77f, 0.67f, 1.25f, 0.67f)
            curveToRelative(0.29f, 0f, 0.57f, -0.08f, 0.83f, -0.25f)
            curveToRelative(0.69f, -0.46f, 0.88f, -1.39f, 0.42f, -2.08f)
            lineToRelative(-2.44f, -3.67f)
            close()
            moveTo(6.0f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(4.0f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-6.5f)
            verticalLineToRelative(-4.5f)
            close()
        }
    }.also { _Prescription = it }
