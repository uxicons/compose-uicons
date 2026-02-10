package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkiingNordic: ImageVector? = null

val Icons.Ss.SkiingNordic: ImageVector
    get() = _SkiingNordic ?: UXIcon(name = "SkiingNordic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.01f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(0.01f, 24f)
                lineTo(0.01f, 22f)
                lineTo(0.02f, 22f)
                lineTo(2.1f, 12f)
                lineTo(4.15f, 12f)
                lineTo(2.07f, 22f)
                lineTo(5.12f, 22f)
                lineToRelative(1.72f, -5.2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, 0.84f)
                lineToRelative(0.67f, 0.42f)
                lineTo(7.27f, 22f)
                lineTo(13f, 22f)
                lineTo(13f, 18.55f)
                lineToRelative(-4.12f, -2.6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.17f, -3.67f)
                lineTo(9.46f, 8f)
                lineTo(6.55f, 8f)
                lineTo(5.23f, 10f)
                horizontalLineToRelative(-2.4f)
                lineTo(5.5f, 6.01f)
                lineTo(5.5f, 6f)
                lineTo(13.87f, 6f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.57f, 1.45f)
                lineTo(18.57f, 11f)
                horizontalLineToRelative(1.95f)
                lineToRelative(0.51f, -2.23f)
                lineToRelative(1.95f, 0.45f)
                lineTo(20.27f, 21.97f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.01f, 20f)
                close()
                moveTo(20.06f, 13f)
                lineTo(17.44f, 13f)
                lineTo(14.62f, 8.33f)
                lineToRelative(-2.9f, 7.03f)
                lineTo(15f, 17.45f)
                lineTo(15f, 22f)
                horizontalLineToRelative(3.21f)
                close()
                moveTo(14.5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0f)
                close()
            }
        }.also { _SkiingNordic = it}
