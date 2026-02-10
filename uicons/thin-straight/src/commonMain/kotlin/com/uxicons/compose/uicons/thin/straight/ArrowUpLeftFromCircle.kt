package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Ts.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 1.71f)
                lineTo(1f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 1.5f)
                curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 1f)
                lineTo(1.71f, 1f)
                lineTo(15.85f, 15.15f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(1f, 1.71f)
                close()
                moveTo(14f, 4f)
                curveToRelative(-1.85f, 0f, -3.59f, 0.51f, -5.08f, 1.39f)
                lineToRelative(0.73f, 0.73f)
                curveToRelative(1.29f, -0.71f, 2.77f, -1.12f, 4.34f, -1.12f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(5f, 18.96f, 5f, 14f)
                curveToRelative(0f, -1.57f, 0.41f, -3.06f, 1.12f, -4.34f)
                lineToRelative(-0.73f, -0.73f)
                curveToRelative(-0.88f, 1.49f, -1.39f, 3.23f, -1.39f, 5.08f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 4f, 14f, 4f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
