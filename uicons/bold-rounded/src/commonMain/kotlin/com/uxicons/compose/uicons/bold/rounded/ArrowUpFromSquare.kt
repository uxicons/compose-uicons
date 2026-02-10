package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromSquare: ImageVector? = null

val Icons.Br.ArrowUpFromSquare: ImageVector
    get() = _ArrowUpFromSquare ?: UXIcon(name = "ArrowUpFromSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.42f, 7.54f)
            curveToRelative(-0.57f, -0.6f, -0.55f, -1.55f, 0.04f, -2.12f)
            lineTo(9.55f, 1.5f)
            curveToRelative(0.64f, -0.64f, 1.52f, -1.0f, 2.45f, -1.0f)
            reflectiveCurveToRelative(1.81f, 0.36f, 2.48f, 1.02f)
            lineToRelative(4.06f, 3.89f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.04f, 2.12f)
            curveToRelative(-0.29f, 0.31f, -0.69f, 0.46f, -1.08f, 0.46f)
            curveToRelative(-0.37f, 0f, -0.75f, -0.14f, -1.04f, -0.42f)
            lineToRelative(-2.96f, -2.84f)
            lineTo(13.5f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(10.5f, 4.75f)
            lineToRelative(-2.96f, 2.84f)
            curveToRelative(-0.6f, 0.57f, -1.55f, 0.55f, -2.12f, -0.04f)
            close()
            moveTo(20.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 10.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 10.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowUpFromSquare = it }
