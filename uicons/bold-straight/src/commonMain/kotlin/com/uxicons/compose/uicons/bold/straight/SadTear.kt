package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadTear: ImageVector? = null

val Icons.Bs.SadTear: ImageVector
    get() = _SadTear ?: UXIcon(name = "SadTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0.2f, 9.4f, -11f, 15.34f, -18.64f, 9.99f)
                arcToRelative(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.53f, -1.55f)
                arcTo(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                curveTo(20.43f, -0.44f, 2.51f, 0.35f, 3.04f, 12.78f)
                arcToRelative(9.17f, 9.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.99f, 4.1f)
                curveTo(-2.58f, 9.24f, 3.5f, -0.2f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(8f, 7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7f)
                close()
                moveTo(18f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                close()
                moveTo(8f, 17.5f)
                curveTo(8f, 15.46f, 5.5f, 13f, 5.5f, 13f)
                curveTo(-1.06f, 19.56f, 7.49f, 22.47f, 8f, 17.5f)
                close()
                moveTo(8.67f, 13.73f)
                arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, 2.74f)
                curveToRelative(2.34f, -1.28f, 5.4f, 0.41f, 6.12f, 1.15f)
                lineTo(18f, 15.38f)
                curveTo(16.76f, 14.13f, 12.34f, 11.84f, 8.67f, 13.73f)
                close()
            }
        }.also { _SadTear = it}
