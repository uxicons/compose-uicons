package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CowbellMore: ImageVector? = null

val Icons.Bs.CowbellMore: ImageVector
    get() = _CowbellMore ?: UXIcon(name = "CowbellMore") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(5.5f, 9.22f)
                lineToRelative(-1.69f, 8.78f)
                lineTo(13f, 18f)
                verticalLineToRelative(5.86f)
                curveToRelative(-0.32f, 0.08f, -0.65f, 0.14f, -1f, 0.14f)
                curveToRelative(-1.86f, 0f, -3.41f, -1.28f, -3.86f, -3f)
                lineTo(0.18f, 21f)
                lineTo(2.56f, 8.65f)
                curveToRelative(0.41f, -2.12f, 2.26f, -3.65f, 4.42f, -3.65f)
                horizontalLineToRelative(0.15f)
                curveToRelative(-0.08f, -0.32f, -0.13f, -0.65f, -0.13f, -1f)
                curveTo(7f, 1.79f, 8.79f, 0f, 11f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.35f, -0.04f, 0.68f, -0.13f, 1f)
                horizontalLineToRelative(0.15f)
                curveToRelative(2.15f, 0f, 4.01f, 1.54f, 4.42f, 3.65f)
                lineToRelative(0.84f, 4.35f)
                horizontalLineToRelative(-3.05f)
                lineToRelative(-0.73f, -3.78f)
                curveToRelative(-0.14f, -0.71f, -0.76f, -1.22f, -1.47f, -1.22f)
                lineTo(6.98f, 8f)
                curveToRelative(-0.72f, 0f, -1.34f, 0.51f, -1.47f, 1.22f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
            }
        }.also { _CowbellMore = it}
