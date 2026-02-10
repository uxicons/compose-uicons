package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRightToBracket: ImageVector? = null

val Icons.Tr.ArrowRightToBracket: ImageVector
    get() = _ArrowRightToBracket ?: UXIcon(name = "ArrowRightToBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, -0.67f, -0.26f, -1.3f, -0.73f, -1.76f)
                lineToRelative(-4.41f, -4.59f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.51f, -0.01f, 0.71f)
                lineToRelative(4.42f, 4.59f)
                curveToRelative(0.16f, 0.16f, 0.28f, 0.35f, 0.35f, 0.56f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                lineTo(0.5f, 11.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(16.91f, 12.5f)
                curveToRelative(-0.07f, 0.21f, -0.2f, 0.4f, -0.36f, 0.57f)
                lineToRelative(-4.41f, 4.59f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.52f, 0.01f, 0.71f)
                curveToRelative(0.1f, 0.09f, 0.22f, 0.14f, 0.35f, 0.14f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.36f, -0.15f)
                lineToRelative(4.41f, -4.58f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                close()
            }
        }.also { _ArrowRightToBracket = it}
