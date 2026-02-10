package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fog: ImageVector? = null

val Icons.Sr.Fog: ImageVector
    get() = _Fog ?: UXIcon(name = "Fog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                lineTo(6f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 24f)
                close()
                moveTo(19f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(17f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 23f)
                close()
                moveTo(19f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(11f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 19f)
                close()
                moveTo(8f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(6f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(7f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19f)
                close()
                moveTo(14f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(6f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 15f)
                close()
                moveTo(19f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(17f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                close()
                moveTo(17.92f, 5.13f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, -0.56f)
                arcTo(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 0.14f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.38f, 6.5f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 2.89f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.32f, 0.87f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.21f, 9.01f)
                curveToRelative(-0.35f, -1.13f, 0.84f, -1.99f, 0.34f, -2.96f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.12f, 12f)
                lineTo(13f, 12f)
                arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, 0.36f)
                curveToRelative(0.89f, 0.49f, 1.64f, -0.47f, 2.58f, -0.36f)
                curveToRelative(1.69f, -0.18f, 3.52f, 0.52f, 3.92f, 2.3f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.31f, 2.16f)
                curveToRelative(-0.45f, 0.72f, 0.28f, 1.34f, 0.34f, 2.06f)
                curveTo(25.92f, 15.05f, 24.66f, 6.37f, 17.92f, 5.13f)
                close()
            }
        }.also { _Fog = it}
