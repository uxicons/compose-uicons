package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disk: ImageVector? = null

val Icons.Br.Disk: ImageVector
    get() = _Disk ?: UXIcon(name = "Disk", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(483.88f, 92.44f)
            lineToRelative(-64.32f, -64.3f)
            curveTo(401.61f, 10.06f, 377.16f, -0.07f, 351.68f, 0f)
            horizontalLineTo(96f)
            curveTo(43.01f, 0.06f, 0.06f, 43.01f, 0f, 96f)
            verticalLineToRelative(320f)
            curveToRelative(0.06f, 52.99f, 43.01f, 95.94f, 96f, 96f)
            horizontalLineToRelative(320f)
            curveToRelative(52.99f, -0.06f, 95.94f, -43.01f, 96f, -96f)
            verticalLineTo(160.32f)
            curveTo(512.07f, 134.85f, 501.95f, 110.4f, 483.88f, 92.44f)
            close()
            moveTo(448f, 416f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            horizontalLineTo(96f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            verticalLineTo(96f)
            curveToRelative(0f, -17.67f, 14.33f, -32f, 32f, -32f)
            horizontalLineToRelative(32f)
            curveToRelative(0f, 47.13f, 38.21f, 85.33f, 85.33f, 85.33f)
            horizontalLineToRelative(64f)
            curveToRelative(46.29f, -0.09f, 84.07f, -37.07f, 85.14f, -83.35f)
            curveToRelative(4.44f, 1.55f, 8.48f, 4.07f, 11.82f, 7.38f)
            lineToRelative(64.34f, 64.34f)
            curveToRelative(6.01f, 5.99f, 9.39f, 14.13f, 9.36f, 22.61f)
            verticalLineTo(416f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(256f, 298.67f)
            moveToRelative(-85.33f, 0f)
            arcToRelative(85.33f, 85.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, 170.67f, 0f)
            arcToRelative(85.33f, 85.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, -170.67f, 0f)
        }
    }.also { _Disk = it }
