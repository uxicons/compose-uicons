package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDownloadAlt: ImageVector? = null

val Icons.Bs.CloudDownloadAlt: ImageVector
    get() = _CloudDownloadAlt ?: UXIcon(name = "CloudDownloadAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                horizontalLineToRelative(2.56f)
                lineToRelative(-3.16f, 3.58f)
                curveToRelative(-0.48f, 0.56f, -1.32f, 0.56f, -1.8f, 0f)
                lineToRelative(-3.16f, -3.58f)
                horizontalLineToRelative(2.56f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 14.29f)
                curveToRelative(0f, 4.25f, -3.46f, 7.71f, -7.71f, 7.71f)
                lineTo(5.32f, 22f)
                curveToRelative(-2.93f, 0f, -5.32f, -2.6f, -5.32f, -5.8f)
                curveToRelative(0f, -1.65f, 0.79f, -3.29f, 2.06f, -4.42f)
                curveToRelative(-0.04f, -0.35f, -0.07f, -0.69f, -0.07f, -1.04f)
                curveTo(2f, 5.92f, 5.92f, 2f, 10.75f, 2f)
                curveToRelative(3.37f, 0f, 6.44f, 1.97f, 7.88f, 4.97f)
                curveToRelative(3.15f, 1.01f, 5.37f, 3.97f, 5.37f, 7.33f)
                close()
                moveTo(21f, 14.29f)
                curveToRelative(0f, -2.22f, -1.58f, -4.15f, -3.76f, -4.59f)
                lineToRelative(-0.81f, -0.17f)
                lineToRelative(-0.29f, -0.78f)
                curveToRelative(-0.83f, -2.24f, -3.0f, -3.75f, -5.38f, -3.75f)
                curveToRelative(-3.17f, 0f, -5.75f, 2.58f, -5.75f, 5.75f)
                curveToRelative(0f, 0.43f, 0.06f, 0.88f, 0.16f, 1.34f)
                lineToRelative(0.25f, 1.06f)
                lineToRelative(-0.93f, 0.57f)
                curveToRelative(-0.89f, 0.54f, -1.48f, 1.54f, -1.48f, 2.49f)
                curveToRelative(0f, 1.54f, 1.04f, 2.8f, 2.32f, 2.8f)
                horizontalLineToRelative(10.98f)
                curveToRelative(2.59f, 0f, 4.71f, -2.11f, 4.71f, -4.71f)
                close()
            }
        }.also { _CloudDownloadAlt = it}
