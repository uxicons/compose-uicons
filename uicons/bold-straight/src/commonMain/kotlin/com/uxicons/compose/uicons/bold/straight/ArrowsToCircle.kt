package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToCircle: ImageVector? = null

val Icons.Bs.ArrowsToCircle: ImageVector
    get() = _ArrowsToCircle ?: UXIcon(name = "ArrowsToCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(15.17f, 10f)
                horizontalLineToRelative(5.83f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(5.4f, -5.4f)
                lineTo(21.84f, 0.04f)
                lineToRelative(-5.4f, 5.4f)
                lineToRelative(-2.44f, -2.44f)
                verticalLineToRelative(5.83f)
                curveToRelative(0f, 0.64f, 0.52f, 1.17f, 1.17f, 1.17f)
                close()
                moveTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(5.44f, 7.56f)
                lineToRelative(-2.44f, 2.44f)
                horizontalLineToRelative(5.83f)
                curveToRelative(0.64f, 0f, 1.17f, -0.52f, 1.17f, -1.17f)
                lineTo(10f, 3f)
                lineToRelative(-2.44f, 2.44f)
                lineTo(2.16f, 0.04f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-5.83f)
                curveToRelative(-0.64f, 0f, -1.17f, 0.52f, -1.17f, 1.17f)
                verticalLineToRelative(5.83f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(5.4f, 5.4f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-5.4f, -5.4f)
                lineToRelative(2.44f, -2.44f)
                close()
                moveTo(8.83f, 14f)
                lineTo(3f, 14f)
                lineToRelative(2.44f, 2.44f)
                lineTo(0.04f, 21.84f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(5.4f, -5.4f)
                lineToRelative(2.44f, 2.44f)
                verticalLineToRelative(-5.83f)
                curveToRelative(0f, -0.64f, -0.52f, -1.17f, -1.17f, -1.17f)
                close()
            }
        }.also { _ArrowsToCircle = it}
