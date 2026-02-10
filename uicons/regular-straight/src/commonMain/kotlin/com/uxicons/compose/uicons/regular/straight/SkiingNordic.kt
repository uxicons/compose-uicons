package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiingNordic: ImageVector? = null

val Icons.Rs.SkiingNordic: ImageVector
    get() = _SkiingNordic ?: UXIcon(name = "SkiingNordic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.5f)
                close()
                moveTo(24f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(0f, 24f)
                lineTo(0f, 22f)
                lineTo(0.01f, 22f)
                lineTo(2.36f, 12f)
                lineTo(4.41f, 12f)
                lineTo(2.06f, 22f)
                lineTo(4.99f, 22f)
                lineToRelative(1.83f, -5.2f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, 0.84f)
                lineToRelative(0.67f, 0.42f)
                lineTo(7.13f, 22f)
                lineTo(12.99f, 22f)
                lineTo(12.99f, 18.55f)
                lineToRelative(-4.12f, -2.6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.7f, 12.27f)
                lineTo(9.45f, 8f)
                lineTo(6.54f, 8f)
                lineTo(5.22f, 10f)
                horizontalLineToRelative(-2.4f)
                lineTo(5.49f, 6f)
                lineTo(13.86f, 6f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.57f, 1.45f)
                lineTo(18.57f, 11f)
                horizontalLineToRelative(1.98f)
                lineToRelative(0.47f, -2.21f)
                lineToRelative(1.96f, 0.42f)
                lineTo(20.24f, 21.98f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                close()
                moveTo(14.99f, 17.45f)
                lineTo(14.99f, 22f)
                horizontalLineToRelative(3.2f)
                lineToRelative(1.93f, -9f)
                lineTo(17.43f, 13f)
                lineTo(15.16f, 9.22f)
                lineToRelative(-1.95f, 4.74f)
                lineTo(11.49f, 12.87f)
                lineTo(13.5f, 8f)
                horizontalLineToRelative(-1.88f)
                lineTo(9.55f, 13.03f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.39f, 1.23f)
                close()
            }
        }.also { _SkiingNordic = it}
