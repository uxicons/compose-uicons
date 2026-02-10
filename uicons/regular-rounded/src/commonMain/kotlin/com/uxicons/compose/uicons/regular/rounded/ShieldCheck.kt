package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCheck: ImageVector? = null

val Icons.Rr.ShieldCheck: ImageVector
    get() = _ShieldCheck ?: UXIcon(name = "ShieldCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.58f, 2.14f)
                lineTo(12.32f, 0.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.63f, 0f)
                lineTo(5.42f, 2.14f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6.88f)
                verticalLineTo(12f)
                curveToRelative(0f, 7.56f, 9.2f, 11.74f, 9.59f, 11.91f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, 0f)
                curveTo(12.8f, 23.74f, 22f, 19.56f, 22f, 12f)
                verticalLineTo(6.88f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.58f, 2.14f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 5.46f, -6.32f, 9.03f, -8f, 9.89f)
                curveToRelative(-1.68f, -0.85f, -8f, -4.42f, -8f, -9.89f)
                verticalLineTo(6.88f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.05f, 4.04f)
                lineTo(12f, 2.05f)
                lineToRelative(5.95f, 1.98f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 6.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.3f, 8.3f)
                lineTo(11.11f, 12.5f)
                lineTo(8.87f, 10.16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.44f, 1.39f)
                lineToRelative(2.31f, 2.4f)
                arcToRelative(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, 0.6f)
                horizontalLineToRelative(0.03f)
                arcToRelative(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, -0.55f)
                lineToRelative(4.27f, -4.27f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.3f, 8.3f)
                close()
            }
        }.also { _ShieldCheck = it}
