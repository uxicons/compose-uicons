package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Br.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.02f, 12.86f)
            arcTo(5.41f, 5.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.9f, 9.43f)
            lineTo(15.38f, 1.6f)
            arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 0f)
            horizontalLineToRelative(0f)
            arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.63f, 1.6f)
            lineTo(2.09f, 9.48f)
            arcTo(5.28f, 5.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12.86f)
            arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, 3.52f)
            lineTo(8.87f, 22.67f)
            arcTo(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.01f, 24f)
            horizontalLineToRelative(0f)
            arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.11f, -1.3f)
            lineTo(21.6f, 16.33f)
            arcTo(5.64f, 5.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.02f, 12.86f)
            close()
            moveTo(13.07f, 3.51f)
            lineToRelative(6.32f, 7.6f)
            lineTo(14.93f, 10.43f)
            lineTo(12.53f, 3.1f)
            arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.07f, 3.51f)
            close()
            moveTo(10.94f, 3.51f)
            lineTo(10.95f, 3.5f)
            arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.52f, -0.39f)
            lineToRelative(-2.4f, 7.33f)
            lineToRelative(-4.43f, 0.68f)
            close()
            moveTo(4.52f, 14.16f)
            lineToRelative(4.18f, -0.64f)
            lineToRelative(1.81f, 1.35f)
            verticalLineToRelative(5.2f)
            reflectiveCurveTo(4.55f, 14.21f, 4.52f, 14.16f)
            close()
            moveTo(13.51f, 20.07f)
            verticalLineToRelative(-5.2f)
            lineToRelative(1.8f, -1.35f)
            lineToRelative(4.21f, 0.64f)
            curveToRelative(-0.02f, 0.03f, -0.04f, 0.05f, -0.07f, 0.08f)
            close()
        }
    }.also { _DiceD10 = it }
