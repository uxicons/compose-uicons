package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guitar: ImageVector? = null

val Icons.Ss.Guitar: ImageVector
    get() = _Guitar ?: UXIcon(name = "Guitar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 15f)
                close()
                moveTo(13.45f, 11.96f)
                lineTo(17.69f, 7.76f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, 7.68f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, 0.96f)
                arcToRelative(0.17f, 0.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.1f, 0.13f)
                arcTo(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.81f, 24f)
                arcToRelative(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.17f, -2.63f)
                curveToRelative(-3.27f, -3.27f, -3.53f, -8.34f, -0.57f, -11.3f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, -2.06f)
                arcTo(0.26f, 0.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, 7.9f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, -1.34f)
                arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.72f, -0.21f)
                lineToRelative(-4.24f, 4.19f)
                close()
                moveTo(6.95f, 19.54f)
                lineTo(4.45f, 17.04f)
                lineTo(3.04f, 18.46f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                close()
                moveTo(23.48f, 0.52f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 0f)
                lineTo(19f, 2.5f)
                lineTo(19f, 3.66f)
                lineToRelative(-2.72f, 2.69f)
                arcToRelative(6.74f, 6.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.62f)
                arcToRelative(6.86f, 6.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, 0.8f)
                lineTo(20.48f, 5f)
                lineTo(21.5f, 5f)
                lineToRelative(1.98f, -1.98f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.48f, 0.52f)
                close()
            }
        }.also { _Guitar = it}
