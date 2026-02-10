package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessGrowth: ImageVector? = null

val Icons.Bs.BusinessGrowth: ImageVector
    get() = _BusinessGrowth ?: UXIcon(name = "BusinessGrowth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(6f, 21f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(15.96f, 4f)
                horizontalLineToRelative(-2.46f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.54f)
                lineToRelative(3.37f, -3.29f)
                curveToRelative(0.35f, -0.35f, 0.91f, -0.35f, 1.26f, 0f)
                close()
                moveTo(21.5f, 6f)
                verticalLineToRelative(4.44f)
                curveToRelative(-0.79f, -0.78f, -1.84f, -1.27f, -3f, -1.39f)
                verticalLineToRelative(-3.05f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(3.37f, -3.29f)
                curveToRelative(0.35f, -0.35f, 0.91f, -0.35f, 1.26f, 0f)
                lineToRelative(3.37f, 3.29f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3.05f)
                curveToRelative(-1.16f, 0.12f, -2.21f, 0.61f, -3f, 1.39f)
                verticalLineToRelative(-4.44f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(3.37f, -3.29f)
                curveToRelative(0.35f, -0.35f, 0.91f, -0.35f, 1.26f, 0f)
                close()
            }
        }.also { _BusinessGrowth = it}
