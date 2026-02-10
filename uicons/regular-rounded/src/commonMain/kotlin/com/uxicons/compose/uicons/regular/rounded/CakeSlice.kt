package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Rr.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.9f, 8.59f)
                curveToRelative(-1.22f, -2.06f, -3.38f, -5.05f, -6.78f, -7.6f)
                curveToRelative(-0.89f, -0.66f, -1.97f, -0.99f, -3.08f, -1.0f)
                curveToRelative(-1.01f, 0.01f, -2.0f, 0.32f, -2.84f, 0.88f)
                curveToRelative(-0.06f, 0.04f, -8.55f, 8.98f, -8.55f, 8.98f)
                curveToRelative(-1.06f, 1.12f, -1.65f, 2.58f, -1.65f, 4.13f)
                verticalLineToRelative(5.01f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.35f)
                curveToRelative(0f, -1.43f, -0.38f, -2.83f, -1.1f, -4.06f)
                close()
                moveTo(2f, 14f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                lineTo(2f, 17f)
                verticalLineToRelative(-3f)
                close()
                moveTo(11.39f, 2.49f)
                curveToRelative(0.5f, -0.31f, 1.08f, -0.48f, 1.67f, -0.49f)
                curveToRelative(0.67f, -0.02f, 1.33f, 0.2f, 1.86f, 0.6f)
                curveToRelative(3.13f, 2.34f, 5.13f, 5.11f, 6.25f, 7.01f)
                curveToRelative(0.43f, 0.73f, 0.7f, 1.55f, 0.79f, 2.39f)
                lineTo(2.53f, 12f)
                curveToRelative(0.16f, -0.27f, 0.35f, -0.53f, 0.57f, -0.76f)
                lineTo(11.39f, 2.49f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(20f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _CakeSlice = it}
