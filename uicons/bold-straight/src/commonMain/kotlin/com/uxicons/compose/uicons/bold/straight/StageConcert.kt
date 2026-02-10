package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StageConcert: ImageVector? = null

val Icons.Bs.StageConcert: ImageVector
    get() = _StageConcert ?: UXIcon(name = "StageConcert") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.01f, 4.1f)
                lineTo(13.51f, 0.04f)
                curveToRelative(-0.96f, -0.46f, -2.06f, -0.46f, -3.02f, 0f)
                lineTo(1.99f, 4.1f)
                curveToRelative(-1.21f, 0.58f, -1.99f, 1.82f, -1.99f, 3.16f)
                verticalLineToRelative(16.74f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.34f)
                lineToRelative(-0.75f, 2f)
                horizontalLineToRelative(12.83f)
                lineToRelative(-0.75f, -2f)
                horizontalLineToRelative(3.34f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(24.0f, 7.26f)
                curveToRelative(0f, -1.34f, -0.78f, -2.58f, -1.99f, -3.16f)
                close()
                moveTo(11.78f, 2.75f)
                curveToRelative(0.14f, -0.07f, 0.29f, -0.07f, 0.43f, 0f)
                lineToRelative(4.71f, 2.25f)
                lineTo(7.07f, 5.0f)
                lineToRelative(4.71f, -2.25f)
                close()
                moveTo(13.0f, 19f)
                verticalLineToRelative(-5.28f)
                lineToRelative(1.94f, -1.55f)
                lineToRelative(-1.87f, -2.34f)
                lineToRelative(-3.06f, 2.45f)
                verticalLineToRelative(6.72f)
                lineTo(3f, 19f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _StageConcert = it}
