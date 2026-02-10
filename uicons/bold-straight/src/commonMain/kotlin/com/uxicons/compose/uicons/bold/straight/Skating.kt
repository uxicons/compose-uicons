package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skating: ImageVector? = null

val Icons.Bs.Skating: ImageVector
    get() = _Skating ?: UXIcon(name = "Skating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 2.5f)
                close()
                moveTo(17f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(16f, 21f)
                lineTo(16f, 18.25f)
                lineToRelative(-3.97f, -4.22f)
                lineToRelative(2.95f, -2.96f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.06f, -5.01f)
                lineTo(13.49f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 8f)
                horizontalLineToRelative(6.16f)
                lineTo(8.95f, 10.34f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.07f, 4.87f)
                lineTo(13f, 19.44f)
                lineTo(13f, 21f)
                lineTo(12f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20.5f)
                lineTo(20f, 20f)
                lineTo(17f, 20f)
                close()
                moveTo(6.95f, 20.86f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 21f)
                arcToRelative(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.33f, -0.12f)
                lineToRelative(-0.42f, -0.45f)
                lineToRelative(3.06f, -3.05f)
                lineTo(6.79f, 15.26f)
                lineTo(3.8f, 18.23f)
                lineTo(3.1f, 17.48f)
                lineTo(0.9f, 19.52f)
                lineTo(4.1f, 22.95f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.59f, 24f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.48f, -1.02f)
                lineToRelative(0.31f, -0.31f)
                lineToRelative(-2.14f, -2.1f)
                close()
            }
        }.also { _Skating = it}
