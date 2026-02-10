package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldCheck: ImageVector? = null

val Icons.Ss.ShieldCheck: ImageVector
    get() = _ShieldCheck ?: UXIcon(name = "ShieldCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.94f, 2.64f)
                lineTo(12f, 0.01f)
                lineTo(4.06f, 2.64f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.49f)
                lineTo(2f, 12f)
                curveToRelative(0f, 7.52f, 9.2f, 11.68f, 9.59f, 11.85f)
                lineToRelative(0.35f, 0.16f)
                lineToRelative(0.37f, -0.12f)
                curveTo(12.71f, 23.75f, 22f, 20.58f, 22f, 12f)
                lineTo(22f, 5.49f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.94f, 2.64f)
                close()
                moveTo(12.44f, 13.99f)
                arcToRelative(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, 0.55f)
                horizontalLineToRelative(-0.03f)
                arcToRelative(1.87f, 1.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.6f)
                lineToRelative(-2.31f, -2.4f)
                lineTo(8.87f, 10.16f)
                lineTo(11.11f, 12.5f)
                lineToRelative(5.18f, -5.18f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _ShieldCheck = it}
