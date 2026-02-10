package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SellerStore: ImageVector? = null

val Icons.Ss.SellerStore: ImageVector
    get() = _SellerStore ?: UXIcon(name = "SellerStore") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18.62f, 20.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.62f, 3.62f)
                close()
                moveTo(21.8f, 0f)
                lineToRelative(2.2f, 6.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.19f, 0f, -2.27f, -0.53f, -3f, -1.36f)
                curveToRelative(-0.73f, 0.83f, -1.81f, 1.36f, -3f, 1.36f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineToRelative(0.02f, -0.72f)
                lineTo(2.2f, 0f)
                horizontalLineToRelative(4.8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(9f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(17f, 0f)
                horizontalLineToRelative(4.8f)
                close()
                moveTo(12.73f, 24f)
                lineTo(4f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-8.81f)
                curveToRelative(0.88f, 0.51f, 1.91f, 0.81f, 3f, 0.81f)
                horizontalLineToRelative(1f)
                curveToRelative(1.06f, 0f, 2.1f, -0.29f, 3f, -0.82f)
                curveToRelative(0.91f, 0.53f, 1.94f, 0.82f, 3f, 0.82f)
                horizontalLineToRelative(0.77f)
                curveToRelative(-1.1f, 1.37f, -1.76f, 3.11f, -1.76f, 5f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.73f, 6f)
                close()
            }
        }.also { _SellerStore = it}
