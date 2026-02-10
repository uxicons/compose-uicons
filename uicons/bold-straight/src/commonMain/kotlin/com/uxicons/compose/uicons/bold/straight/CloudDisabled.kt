package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDisabled: ImageVector? = null

val Icons.Bs.CloudDisabled: ImageVector
    get() = _CloudDisabled ?: UXIcon(name = "CloudDisabled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14.85f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.02f, -7.85f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.88f, -6f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.15f, 1.82f)
                lineToRelative(-2.75f, -2.76f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(21.75f, 21.75f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.81f, -1.8f)
                arcToRelative(8.07f, 8.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.87f, -5.16f)
                close()
                moveTo(10.09f, 4f)
                arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.13f, 4.46f)
                lineToRelative(0.15f, 1.14f)
                lineToRelative(1.14f, 0.15f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.49f, 5.1f)
                arcToRelative(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 3.02f)
                lineToRelative(-12.93f, -12.92f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.02f, -0.95f)
                close()
                moveTo(13.65f, 20f)
                lineTo(16.61f, 22.96f)
                curveToRelative(-0.26f, 0.03f, -0.53f, 0.04f, -0.8f, 0.04f)
                horizontalLineToRelative(-10.02f)
                arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.8f, -5.78f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.72f, -4.92f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, -3.27f)
                curveToRelative(0f, -0.21f, 0.01f, -0.42f, 0.03f, -0.62f)
                lineToRelative(4.89f, 4.89f)
                lineToRelative(0.43f, 0.58f)
                lineToRelative(-2.17f, 0.56f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.22f, 2.79f)
                arcToRelative(2.79f, 2.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, 2.77f)
                close()
            }
        }.also { _CloudDisabled = it}
