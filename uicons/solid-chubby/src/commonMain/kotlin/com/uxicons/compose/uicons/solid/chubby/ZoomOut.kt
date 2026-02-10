package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomOut: ImageVector? = null

val Icons.Sc.ZoomOut: ImageVector
    get() = _ZoomOut ?: UXIcon(name = "ZoomOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.56f, 20.37f)
                lineToRelative(-4.33f, -4.29f)
                curveToRelative(0.96f, -1.47f, 1.47f, -3.39f, 1.51f, -5.73f)
                curveToRelative(-0.1f, -5.94f, -3.43f, -9.23f, -9.38f, -9.27f)
                curveTo(4.35f, 1.1f, 1.11f, 4.31f, 1f, 10.34f)
                verticalLineToRelative(0.04f)
                curveToRelative(0.11f, 6.03f, 3.35f, 9.24f, 9.37f, 9.27f)
                curveToRelative(2.33f, -0.01f, 4.25f, -0.51f, 5.73f, -1.46f)
                lineToRelative(4.34f, 4.31f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.06f, 0.43f)
                curveToRelative(0.39f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
                close()
                moveTo(12.79f, 11.57f)
                horizontalLineToRelative(-4.4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.56f, 20.37f)
                lineToRelative(-4.33f, -4.29f)
                curveToRelative(0.96f, -1.47f, 1.47f, -3.39f, 1.51f, -5.73f)
                curveToRelative(-0.1f, -5.94f, -3.43f, -9.23f, -9.38f, -9.27f)
                curveTo(4.35f, 1.1f, 1.12f, 4.31f, 1.01f, 10.34f)
                curveToRelative(0f, 0f, -0.79f, 9.31f, 9.37f, 9.31f)
                curveToRelative(2.33f, 0f, 4.25f, -0.51f, 5.73f, -1.46f)
                lineToRelative(4.34f, 4.31f)
                curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.06f, 0.43f)
                curveToRelative(0.39f, 0f, 0.77f, -0.15f, 1.06f, -0.44f)
                curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
                close()
                moveTo(12.79f, 11.57f)
                horizontalLineToRelative(-4.4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ZoomOut = it}
