package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertDocument: ImageVector? = null

val Icons.Sr.ConvertDocument: ImageVector
    get() = _ConvertDocument ?: UXIcon(name = "ConvertDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 1.3f)
                curveToRelative(0.7f, 0.24f, 1.34f, 0.63f, 1.88f, 1.16f)
                lineToRelative(3.66f, 3.66f)
                curveToRelative(0.54f, 0.54f, 0.92f, 1.18f, 1.17f, 1.88f)
                horizontalLineToRelative(-5.7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(17f, 1.3f)
                close()
                moveTo(18f, 10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(15f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(6.09f)
                lineToRelative(-1.8f, -1.79f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.42f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.8f, 2.8f)
                curveToRelative(0.39f, 0.39f, 0.58f, 0.9f, 0.58f, 1.41f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0.0f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0.0f)
                curveToRelative(0f, 0.51f, -0.19f, 1.02f, -0.58f, 1.4f)
                lineToRelative(-2.8f, 2.8f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                horizontalLineToRelative(-6.08f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(9f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(5f, 19f)
                lineTo(5f, 5f)
                curveToRelative(0f, -1.54f, 0.59f, -2.94f, 1.54f, -4f)
                horizontalLineToRelative(-2.54f)
                curveTo(1.79f, 1f, 0f, 2.79f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2.54f)
                curveToRelative(-0.95f, -1.06f, -1.54f, -2.46f, -1.54f, -4f)
                close()
            }
        }.also { _ConvertDocument = it}
