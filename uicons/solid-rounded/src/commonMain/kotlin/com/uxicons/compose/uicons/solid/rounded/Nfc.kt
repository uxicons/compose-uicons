package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Nfc: ImageVector? = null

val Icons.Sr.Nfc: ImageVector
    get() = _Nfc ?: UXIcon(name = "Nfc") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(21f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(5f, 21f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(3f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.4f, 0f, 0.77f, 0.24f, 0.92f, 0.62f)
                curveToRelative(0.16f, 0.37f, 0.07f, 0.8f, -0.22f, 1.09f)
                lineToRelative(-2.71f, 2.71f)
                verticalLineToRelative(11.59f)
                horizontalLineToRelative(14f)
                lineTo(18.99f, 5f)
                horizontalLineToRelative(-4.67f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineToRelative(-3.33f, 3.33f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineToRelative(4.67f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-4.67f)
                curveToRelative(0f, -0.8f, 0.31f, -1.56f, 0.88f, -2.12f)
                lineToRelative(3.33f, -3.33f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(4.67f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _Nfc = it}
