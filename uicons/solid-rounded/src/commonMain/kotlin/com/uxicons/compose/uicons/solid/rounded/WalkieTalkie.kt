package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalkieTalkie: ImageVector? = null

val Icons.Sr.WalkieTalkie: ImageVector
    get() = _WalkieTalkie ?: UXIcon(name = "WalkieTalkie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.42f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.54f, -3f, 4.58f)
                verticalLineToRelative(3.6f)
                curveToRelative(0f, 1.13f, 0.39f, 2.24f, 1.1f, 3.12f)
                lineToRelative(0.69f, 0.86f)
                curveToRelative(0.14f, 0.18f, 0.22f, 0.4f, 0.22f, 0.62f)
                verticalLineToRelative(2.8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2.8f)
                curveToRelative(0f, -0.23f, 0.08f, -0.45f, 0.22f, -0.62f)
                lineToRelative(0.69f, -0.86f)
                curveToRelative(0.71f, -0.88f, 1.1f, -1.99f, 1.1f, -3.12f)
                verticalLineToRelative(-3.6f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(18f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 9f)
                verticalLineToRelative(2f)
                reflectiveCurveToRelative(-8f, 0f, -8f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _WalkieTalkie = it}
