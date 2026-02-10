package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParagraphLeft: ImageVector? = null

val Icons.Br.ParagraphLeft: ImageVector
    get() = _ParagraphLeft ?: UXIcon(name = "ParagraphLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9f, 12f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(15f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(20f, 3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-11.5f)
            curveTo(5.69f, 0f, 3f, 2.69f, 3f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(9f, 3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(23f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(6f, 21f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.89f, -1.08f, 1.34f, -1.71f, 0.71f)
            lineToRelative(-2.97f, -2.97f)
            curveToRelative(-0.43f, -0.43f, -0.43f, -1.12f, 0f, -1.54f)
            lineToRelative(2.97f, -2.97f)
            curveToRelative(0.63f, -0.63f, 1.71f, -0.18f, 1.71f, 0.71f)
            verticalLineToRelative(1.58f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _ParagraphLeft = it }
