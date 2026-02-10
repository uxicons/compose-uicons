package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoteYea: ImageVector? = null

val Icons.Bs.VoteYea: ImageVector
    get() = _VoteYea ?: UXIcon(name = "VoteYea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13.04f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.54f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(5.5f)
                lineTo(24f, 22f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.22f, -3f, -3.46f)
                close()
                moveTo(6f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                lineTo(6f, 17f)
                lineTo(6f, 5.5f)
                close()
                moveTo(15.17f, 7.56f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.94f, 3.94f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.12f, -0.88f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(3.94f, -3.94f)
                close()
            }
        }.also { _VoteYea = it}
