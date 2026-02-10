package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudHailMixed: ImageVector? = null

val Icons.Ss.CloudHailMixed: ImageVector
    get() = _CloudHailMixed ?: UXIcon(name = "CloudHailMixed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15f)
                close()
                moveTo(6f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                close()
                moveTo(9.22f, 14.24f)
                lineTo(7.28f, 13.76f)
                lineTo(5.78f, 19.76f)
                lineTo(7.72f, 20.24f)
                close()
                moveTo(14f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 22f)
                close()
                moveTo(17.22f, 14.24f)
                lineTo(15.28f, 13.76f)
                lineTo(13.78f, 19.76f)
                lineTo(15.72f, 20.24f)
                close()
                moveTo(12.29f, 18.01f)
                lineTo(10.35f, 17.53f)
                lineTo(8.85f, 23.53f)
                lineTo(10.79f, 24.01f)
                close()
                moveTo(17.44f, 5.06f)
                curveTo(13.61f, -4.04f, -0.07f, 0.21f, 2.27f, 10.05f)
                arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.47f, 9.64f)
                lineTo(5.33f, 13.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.26f, 12f)
                horizontalLineToRelative(9.98f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.94f, 2.47f)
                lineToRelative(-1.3f, 5.35f)
                lineToRelative(0.11f, 0.02f)
                curveTo(26.22f, 18.07f, 25.83f, 6.19f, 17.44f, 5.06f)
                close()
            }
        }.also { _CloudHailMixed = it}
