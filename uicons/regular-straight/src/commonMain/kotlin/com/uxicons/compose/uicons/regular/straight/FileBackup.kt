package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileBackup: ImageVector? = null

val Icons.Rs.FileBackup: ImageVector
    get() = _FileBackup ?: UXIcon(name = "FileBackup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.75f, 11f)
                lineToRelative(-3.48f, 11f)
                horizontalLineToRelative(-0.27f)
                verticalLineToRelative(-17f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.4f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(0.6f)
                verticalLineToRelative(-1.93f)
                lineToRelative(-4.12f, -2.07f)
                horizontalLineToRelative(-2.88f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(20.48f)
                lineToRelative(3.52f, -13f)
                close()
                moveTo(18.95f, 22f)
                horizontalLineToRelative(-14.58f)
                lineToRelative(2.85f, -9f)
                horizontalLineToRelative(14.19f)
                lineToRelative(-2.46f, 9f)
                close()
                moveTo(14f, 6.68f)
                curveToRelative(0.65f, 0.19f, 1.46f, 0.32f, 2.5f, 0.32f)
                curveToRelative(1.02f, 0f, 1.84f, -0.13f, 2.5f, -0.33f)
                verticalLineToRelative(2.33f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.88f, -1.85f, -1.5f, -4.5f, -1.5f)
                reflectiveCurveToRelative(-4.5f, 0.62f, -4.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(14f, 2.77f)
                curveToRelative(0.7f, 0.14f, 1.54f, 0.23f, 2.5f, 0.23f)
                reflectiveCurveToRelative(1.8f, -0.08f, 2.5f, -0.23f)
                verticalLineToRelative(1.74f)
                curveToRelative(-0.27f, 0.18f, -1.03f, 0.49f, -2.5f, 0.49f)
                curveToRelative(-1.5f, 0f, -2.25f, -0.29f, -2.5f, -0.46f)
                verticalLineToRelative(-1.77f)
                close()
            }
        }.also { _FileBackup = it}
