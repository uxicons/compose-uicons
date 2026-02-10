package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joint: ImageVector? = null

val Icons.Rs.Joint: ImageVector
    get() = _Joint ?: UXIcon(name = "Joint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.45f, 19.14f)
                lineToRelative(-0.45f, 0.35f)
                verticalLineToRelative(1.08f)
                lineToRelative(0.46f, 0.29f)
                curveToRelative(0.13f, 0.09f, 3.31f, 2.13f, 6.52f, 2.13f)
                horizontalLineToRelative(17.03f)
                verticalLineToRelative(-6f)
                lineTo(6.97f, 17f)
                curveToRelative(-3.22f, 0f, -6.39f, 2.05f, -6.52f, 2.13f)
                close()
                moveTo(3.06f, 20.0f)
                curveToRelative(1.04f, -0.48f, 2.5f, -1.0f, 3.91f, -1.0f)
                horizontalLineToRelative(0.61f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-2.62f)
                curveToRelative(-1.4f, 0f, -2.86f, -0.52f, -3.91f, -1.0f)
                close()
                moveTo(10.41f, 19f)
                horizontalLineToRelative(4.17f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(22f, 21f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 5.86f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.86f)
                curveToRelative(0f, 1.05f, 0.56f, 2.03f, 1.46f, 2.57f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.2f, 0.72f, 1.94f, 2.03f, 1.94f, 3.43f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0f, -0.7f, -0.37f, -1.35f, -0.97f, -1.72f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.5f, -0.9f, -2.43f, -2.54f, -2.43f, -4.29f)
                close()
                moveTo(24f, 11.26f)
                verticalLineToRelative(1.74f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.74f)
                curveToRelative(0f, -1.05f, -0.56f, -2.03f, -1.46f, -2.57f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.9f, -0.54f, -1.46f, -1.52f, -1.46f, -2.57f)
                lineTo(17.0f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.35f, 0.19f, 0.68f, 0.48f, 0.86f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(1.5f, 0.9f, 2.43f, 2.54f, 2.43f, 4.29f)
                close()
            }
        }.also { _Joint = it}
