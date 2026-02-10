package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentUser: ImageVector? = null

val Icons.Sr.CommentUser: ImageVector
    get() = _CommentUser ?: UXIcon(name = "CommentUser", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 169.51f)
                curveToRelative(17.94f, 0f, 32.49f, -14.55f, 32.49f, -32.49f)
                reflectiveCurveTo(273.94f, 104.53f, 256f, 104.53f)
                reflectiveCurveToRelative(-32.49f, 14.55f, -32.49f, 32.49f)
                reflectiveCurveTo(238.06f, 169.51f, 256f, 169.51f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(426.67f, 0.02f)
                horizontalLineTo(85.33f)
                curveTo(37.89f, 0.39f, -0.28f, 39.1f, 0f, 86.54f)
                verticalLineTo(346.17f)
                curveToRelative(-0.28f, 47.44f, 37.89f, 86.16f, 85.33f, 86.55f)
                horizontalLineToRelative(62.36f)
                lineToRelative(79.96f, 68.27f)
                curveToRelative(15.84f, 14.47f, 40.04f, 14.69f, 56.13f, 0.49f)
                lineToRelative(82.03f, -68.78f)
                horizontalLineToRelative(60.86f)
                curveToRelative(47.44f, -0.39f, 85.62f, -39.11f, 85.33f, -86.55f)
                verticalLineTo(86.54f)
                curveTo(512.28f, 39.1f, 474.11f, 0.39f, 426.67f, 0.02f)
                close()
                moveTo(256f, 64.91f)
                curveToRelative(98.45f, 2.6f, 98.43f, 148.84f, 0f, 151.47f)
                curveTo(157.55f, 213.75f, 157.57f, 67.58f, 256f, 64.91f)
                close()
                moveTo(346.64f, 367.12f)
                curveToRelative(-11.42f, 2.91f, -23.03f, -3.98f, -25.94f, -15.4f)
                curveToRelative(-0.01f, -0.05f, -0.03f, -0.1f, -0.04f, -0.16f)
                curveToRelative(-10.92f, -35.72f, -48.73f, -55.82f, -84.44f, -44.9f)
                curveToRelative(-21.5f, 6.57f, -38.33f, 23.4f, -44.9f, 44.9f)
                curveToRelative(-2.98f, 11.4f, -14.64f, 18.23f, -26.05f, 15.25f)
                curveToRelative(-11.4f, -2.98f, -18.23f, -14.64f, -15.25f, -26.05f)
                lineToRelative(0f, 0f)
                curveToRelative(16.5f, -58.54f, 77.32f, -92.62f, 135.86f, -76.13f)
                curveToRelative(36.9f, 10.4f, 65.73f, 39.23f, 76.13f, 76.13f)
                curveTo(364.98f, 352.28f, 358.12f, 364.03f, 346.64f, 367.12f)
                close()
            }
        }.also { _CommentUser = it}
