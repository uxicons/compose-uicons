package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockMicrophone: ImageVector? = null

val Icons.Ss.BlockMicrophone: ImageVector
    get() = _BlockMicrophone ?: UXIcon(name = "BlockMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -0.74f, 0.22f, -1.42f, 0.57f, -2.02f)
                lineToRelative(5.45f, 5.45f)
                curveToRelative(-0.59f, 0.35f, -1.28f, 0.57f, -2.02f, 0.57f)
                close()
                moveTo(21.43f, 20.02f)
                lineToRelative(-5.45f, -5.45f)
                curveToRelative(0.59f, -0.35f, 1.28f, -0.57f, 2.02f, -0.57f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.74f, -0.22f, 1.42f, -0.57f, 2.02f)
                close()
                moveTo(12.72f, 24f)
                horizontalLineToRelative(-1.72f)
                curveTo(4.93f, 24f, 0f, 19.07f, 0f, 13f)
                lineTo(2f, 13f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                horizontalLineToRelative(0.08f)
                curveToRelative(0.44f, 0.75f, 0.99f, 1.43f, 1.64f, 2f)
                close()
                moveTo(10.21f, 19.79f)
                curveToRelative(-3.23f, -0.74f, -5.72f, -3.45f, -6.14f, -6.79f)
                horizontalLineToRelative(4.93f)
                verticalLineToRelative(-2f)
                lineTo(4f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(4.07f, 7f)
                curveTo(4.56f, 3.06f, 7.93f, 0f, 12f, 0f)
                reflectiveCurveToRelative(7.44f, 3.06f, 7.93f, 7f)
                horizontalLineToRelative(-4.93f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.26f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 0.62f, 0.08f, 1.21f, 0.21f, 1.79f)
                close()
            }
        }.also { _BlockMicrophone = it}
