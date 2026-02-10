package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpLeftFromCircle: ImageVector? = null

val Icons.Bs.ArrowUpLeftFromCircle: ImageVector
    get() = _ArrowUpLeftFromCircle ?: UXIcon(name = "ArrowUpLeftFromCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5.12f)
                verticalLineToRelative(4.88f)
                lineTo(0f, 10f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(7.5f)
                lineTo(10f, 3f)
                lineTo(5.12f, 3f)
                lineToRelative(11.44f, 11.44f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(3f, 5.12f)
                close()
                moveTo(14f, 4f)
                curveToRelative(-1.48f, 0f, -2.88f, 0.33f, -4.14f, 0.91f)
                lineToRelative(2.34f, 2.34f)
                curveToRelative(0.58f, -0.15f, 1.18f, -0.24f, 1.81f, -0.24f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -0.62f, 0.09f, -1.23f, 0.24f, -1.81f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.58f, 1.26f, -0.91f, 2.66f, -0.91f, 4.14f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(19.51f, 4f, 14f, 4f)
                close()
            }
        }.also { _ArrowUpLeftFromCircle = it}
