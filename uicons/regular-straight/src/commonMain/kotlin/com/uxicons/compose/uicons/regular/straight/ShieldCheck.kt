package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCheck: ImageVector? = null

val Icons.Rs.ShieldCheck: ImageVector
    get() = _ShieldCheck ?: UXIcon(name = "ShieldCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.95f, 24.01f)
                lineToRelative(-0.35f, -0.16f)
                curveTo(11.2f, 23.68f, 2f, 19.52f, 2f, 12f)
                verticalLineTo(5.48f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.05f, 2.64f)
                lineTo(12f, 0.01f)
                lineToRelative(7.95f, 2.63f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5.48f)
                verticalLineTo(12f)
                curveToRelative(0f, 8.58f, -9.29f, 11.76f, -9.68f, 11.89f)
                close()
                moveTo(12f, 2.11f)
                lineTo(4.68f, 4.53f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5.48f)
                verticalLineTo(12f)
                curveToRelative(0f, 5.49f, 6.44f, 9.06f, 8.05f, 9.86f)
                curveTo(13.65f, 21.22f, 20f, 18.26f, 20f, 12f)
                verticalLineTo(5.48f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.68f, -0.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.11f, 14.54f)
                horizontalLineToRelative(-0.03f)
                arcToRelative(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.6f)
                lineToRelative(-2.31f, -2.4f)
                lineTo(8.87f, 10.16f)
                lineTo(11.11f, 12.5f)
                lineToRelative(5.18f, -5.18f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-5.26f, 5.26f)
                arcTo(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.11f, 14.54f)
                close()
            }
        }.also { _ShieldCheck = it}
