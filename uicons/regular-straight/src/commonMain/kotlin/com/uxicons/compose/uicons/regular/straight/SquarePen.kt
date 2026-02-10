package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Rs.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(13.88f, 5.88f)
                lineTo(5f, 14.76f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(8.87f, -8.87f)
                curveToRelative(0.56f, -0.54f, 0.89f, -1.32f, 0.89f, -2.14f)
                curveToRelative(0f, -0.81f, -0.33f, -1.59f, -0.87f, -2.12f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                close()
                moveTo(8.41f, 17f)
                horizontalLineToRelative(-1.41f)
                verticalLineToRelative(-1.41f)
                lineToRelative(5.84f, -5.84f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(16.71f, 8.71f)
                lineTo(15.66f, 9.75f)
                lineTo(14.25f, 8.34f)
                lineTo(15.3f, 7.29f)
                curveToRelative(0.38f, -0.38f, 1.02f, -0.39f, 1.43f, 0.02f)
                curveToRelative(0.17f, 0.17f, 0.27f, 0.42f, 0.27f, 0.69f)
                curveToRelative(0f, 0.27f, -0.1f, 0.53f, -0.29f, 0.71f)
                close()
            }
        }.also { _SquarePen = it}
