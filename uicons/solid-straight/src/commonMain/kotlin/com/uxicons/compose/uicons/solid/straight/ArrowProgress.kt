package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowProgress: ImageVector? = null

val Icons.Ss.ArrowProgress: ImageVector
    get() = _ArrowProgress ?: UXIcon(name = "ArrowProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 20f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21.5f, 6.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.5f, 14.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(4.5f, 10f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.46f)
                lineToRelative(-1.64f, 1.64f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.76f, -2.76f)
                curveToRelative(0.34f, -0.34f, 0.52f, -0.78f, 0.52f, -1.26f)
                reflectiveCurveToRelative(-0.19f, -0.92f, -0.52f, -1.26f)
                lineTo(13.73f, 0.01f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.57f, 1.57f)
                lineTo(4.5f, 3f)
                curveTo(2.02f, 3f, 0f, 5.02f, 0f, 7.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21.5f, 17.58f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(13.79f, 16.07f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.51f, 1.51f)
                horizontalLineToRelative(-6.89f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.96f)
                lineToRelative(-1.58f, 1.58f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.71f, -2.71f)
                curveToRelative(0.69f, -0.69f, 0.69f, -1.81f, 0f, -2.5f)
                lineToRelative(-2.71f, -2.71f)
                close()
            }
        }.also { _ArrowProgress = it}
